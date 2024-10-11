package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.ChromeLine: ImageVector
    get() {
        if (_chromeLine != null) {
            return _chromeLine!!
        }
        _chromeLine = Builder(name = "ChromeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.365f, 19.833f)
                lineTo(12.294f, 16.49f)
                curveTo(12.197f, 16.497f, 12.099f, 16.5f, 12.0f, 16.5f)
                curveTo(10.304f, 16.5f, 8.827f, 15.561f, 8.06f, 14.175f)
                lineTo(4.795f, 8.52f)
                curveTo(4.285f, 9.572f, 4.0f, 10.753f, 4.0f, 12.0f)
                curveTo(4.0f, 15.858f, 6.731f, 19.078f, 10.365f, 19.833f)
                close()
                moveTo(12.59f, 19.979f)
                curveTo(16.733f, 19.677f, 20.0f, 16.22f, 20.0f, 12.0f)
                curveTo(20.0f, 11.127f, 19.86f, 10.286f, 19.602f, 9.5f)
                horizontalLineTo(15.742f)
                curveTo(16.221f, 10.215f, 16.5f, 11.075f, 16.5f, 12.0f)
                curveTo(16.5f, 12.848f, 16.266f, 13.641f, 15.858f, 14.318f)
                lineTo(12.59f, 19.979f)
                close()
                moveTo(14.143f, 13.288f)
                lineTo(14.165f, 13.25f)
                curveTo(14.378f, 12.882f, 14.5f, 12.455f, 14.5f, 12.0f)
                curveTo(14.5f, 10.619f, 13.381f, 9.5f, 12.0f, 9.5f)
                curveTo(10.619f, 9.5f, 9.5f, 10.619f, 9.5f, 12.0f)
                curveTo(9.5f, 12.438f, 9.613f, 12.85f, 9.811f, 13.208f)
                lineTo(9.835f, 13.25f)
                curveTo(10.267f, 13.997f, 11.075f, 14.5f, 12.0f, 14.5f)
                curveTo(12.91f, 14.5f, 13.706f, 14.014f, 14.143f, 13.288f)
                close()
                moveTo(6.035f, 6.669f)
                lineTo(7.964f, 10.009f)
                curveTo(8.698f, 8.522f, 10.23f, 7.5f, 12.0f, 7.5f)
                horizontalLineTo(18.615f)
                curveTo(17.175f, 5.387f, 14.75f, 4.0f, 12.0f, 4.0f)
                curveTo(9.63f, 4.0f, 7.5f, 5.031f, 6.035f, 6.669f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _chromeLine!!
    }

private var _chromeLine: ImageVector? = null
