package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ExpandVerticalFill: ImageVector
    get() {
        if (_expandVerticalFill != null) {
            return _expandVerticalFill!!
        }
        _expandVerticalFill = Builder(name = "ExpandVerticalFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.5f)
                lineTo(16.949f, 5.449f)
                lineTo(13.0f, 5.448f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.448f)
                lineTo(7.052f, 5.447f)
                lineTo(12.0f, 0.5f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(11.0f, 18.55f)
                lineTo(7.05f, 18.55f)
                lineTo(12.0f, 23.5f)
                lineTo(16.95f, 18.55f)
                lineTo(13.0f, 18.55f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _expandVerticalFill!!
    }

private var _expandVerticalFill: ImageVector? = null
