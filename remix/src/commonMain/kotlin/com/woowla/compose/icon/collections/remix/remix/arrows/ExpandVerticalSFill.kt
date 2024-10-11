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

public val ArrowsGroup.ExpandVerticalSFill: ImageVector
    get() {
        if (_expandVerticalSFill != null) {
            return _expandVerticalSFill!!
        }
        _expandVerticalSFill = Builder(name = "ExpandVerticalSFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.949f, 7.449f)
                lineTo(12.0f, 2.5f)
                lineTo(7.052f, 7.447f)
                lineTo(11.0f, 7.448f)
                lineTo(11.0f, 16.55f)
                lineTo(7.05f, 16.55f)
                lineTo(12.0f, 21.5f)
                lineTo(16.95f, 16.55f)
                lineTo(13.0f, 16.55f)
                lineTo(13.0f, 7.448f)
                lineTo(16.949f, 7.449f)
                close()
            }
        }
        .build()
        return _expandVerticalSFill!!
    }

private var _expandVerticalSFill: ImageVector? = null
