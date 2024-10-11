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

public val ArrowsGroup.CollapseHorizontalFill: ImageVector
    get() {
        if (_collapseHorizontalFill != null) {
            return _collapseHorizontalFill!!
        }
        _collapseHorizontalFill = Builder(name = "CollapseHorizontalFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                lineTo(18.45f, 7.05f)
                lineTo(18.449f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.448f)
                lineTo(18.447f, 16.947f)
                lineTo(13.5f, 12.0f)
                close()
                moveTo(1.0f, 13.0f)
                horizontalLineTo(5.55f)
                lineTo(5.55f, 16.949f)
                lineTo(10.5f, 12.0f)
                lineTo(5.55f, 7.05f)
                lineTo(5.55f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _collapseHorizontalFill!!
    }

private var _collapseHorizontalFill: ImageVector? = null
