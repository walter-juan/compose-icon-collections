package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Novu: ImageVector
    get() {
        if (_novu != null) {
            return _novu!!
        }
        _novu = Builder(name = "Novu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.48f, 9.619f)
                curveToRelative(0.0f, 0.645f, -0.783f, 0.965f, -1.235f, 0.503f)
                lineTo(8.007f, 0.68f)
                curveTo(9.256f, 0.24f, 10.6f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.387f, 0.0f, 4.611f, 0.697f, 6.48f, 1.898f)
                close()
                moveTo(21.84f, 5.13f)
                verticalLineToRelative(4.49f)
                curveToRelative(0.0f, 3.656f, -4.439f, 5.467f, -6.996f, 2.853f)
                lineTo(4.909f, 2.319f)
                curveTo(1.932f, 4.502f, 0.0f, 8.026f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.555f, 0.799f, 4.924f, 2.16f, 6.87f)
                verticalLineToRelative(-4.465f)
                curveToRelative(0.0f, -3.656f, 4.439f, -5.467f, 6.996f, -2.853f)
                lineToRelative(9.921f, 10.14f)
                curveTo(22.062f, 19.509f, 24.0f, 15.981f, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.555f, -0.799f, -4.924f, -2.16f, -6.87f)
                close()
                moveTo(6.755f, 13.901f)
                lineToRelative(9.221f, 9.425f)
                curveTo(14.732f, 23.763f, 13.393f, 24.0f, 12.0f, 24.0f)
                curveToRelative(-2.387f, 0.0f, -4.611f, -0.697f, -6.48f, -1.898f)
                verticalLineToRelative(-7.697f)
                curveToRelative(0.0f, -0.645f, 0.783f, -0.965f, 1.235f, -0.503f)
                close()
            }
        }
        .build()
        return _novu!!
    }

private var _novu: ImageVector? = null
