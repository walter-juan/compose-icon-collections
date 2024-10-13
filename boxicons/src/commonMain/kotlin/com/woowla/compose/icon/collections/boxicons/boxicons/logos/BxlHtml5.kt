package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlHtml5: ImageVector
    get() {
        if (_bxlHtml5 != null) {
            return _bxlHtml5!!
        }
        _bxlHtml5 = Builder(name = "BxlHtml5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.136f, 3.012f)
                horizontalLineToRelative(15.729f)
                lineToRelative(-1.431f, 16.15f)
                lineToRelative(-6.451f, 1.826f)
                lineToRelative(-6.414f, -1.826f)
                lineToRelative(-1.433f, -16.15f)
                close()
                moveTo(9.402f, 10.314f)
                lineTo(9.229f, 8.279f)
                lineTo(16.762f, 8.281f)
                lineTo(16.935f, 6.318f)
                lineTo(7.065f, 6.316f)
                lineTo(7.587f, 12.314f)
                horizontalLineToRelative(6.835f)
                lineToRelative(-0.243f, 2.566f)
                lineToRelative(-2.179f, 0.602f)
                lineToRelative(-2.214f, -0.605f)
                lineToRelative(-0.141f, -1.58f)
                lineTo(7.691f, 13.297f)
                lineToRelative(0.247f, 3.123f)
                lineTo(12.0f, 17.506f)
                lineToRelative(4.028f, -1.08f)
                lineToRelative(0.558f, -6.111f)
                lineTo(9.402f, 10.315f)
                verticalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _bxlHtml5!!
    }

private var _bxlHtml5: ImageVector? = null
