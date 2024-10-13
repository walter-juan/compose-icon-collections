package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxShieldAlt: ImageVector
    get() {
        if (_bxShieldAlt != null) {
            return _bxShieldAlt!!
        }
        _bxShieldAlt = Builder(name = "BxShieldAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.342f, 8.447f)
                lineToRelative(1.105f, -0.553f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 21.8f, 6.4f)
                lineToRelative(-3.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 0.4f)
                lineToRelative(-3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.352f, 1.494f)
                lineToRelative(1.105f, 0.553f)
                lineToRelative(-1.131f, 2.262f)
                arcTo(5.052f, 5.052f, 0.0f, false, false, 2.0f, 12.944f)
                verticalLineToRelative(0.591f)
                arcToRelative(6.028f, 6.028f, 0.0f, false, false, 3.894f, 5.618f)
                lineToRelative(3.431f, 1.286f)
                arcToRelative(5.488f, 5.488f, 0.0f, false, true, 1.969f, 1.268f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.413f, 0.0f)
                arcToRelative(5.486f, 5.486f, 0.0f, false, true, 1.969f, -1.267f)
                lineToRelative(3.432f, -1.287f)
                arcTo(6.03f, 6.03f, 0.0f, false, false, 22.0f, 13.535f)
                verticalLineToRelative(-0.591f)
                curveToRelative(0.0f, -0.771f, -0.183f, -1.545f, -0.527f, -2.236f)
                lineToRelative(-1.131f, -2.261f)
                close()
                moveTo(20.0f, 13.535f)
                arcToRelative(4.019f, 4.019f, 0.0f, false, true, -2.596f, 3.745f)
                lineToRelative(-3.431f, 1.287f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -1.974f, 1.101f)
                arcToRelative(7.515f, 7.515f, 0.0f, false, false, -1.974f, -1.102f)
                lineTo(6.596f, 17.28f)
                arcTo(4.019f, 4.019f, 0.0f, false, true, 4.0f, 13.535f)
                verticalLineToRelative(-0.591f)
                curveToRelative(0.0f, -0.463f, 0.109f, -0.928f, 0.316f, -1.342f)
                lineToRelative(1.131f, -2.261f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, false, -0.895f, -2.684f)
                lineToRelative(-0.033f, -0.015f)
                lineTo(6.5f, 4.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(1.981f, 2.642f)
                lineToRelative(-0.034f, 0.017f)
                arcToRelative(2.004f, 2.004f, 0.0f, false, false, -0.895f, 2.684f)
                lineToRelative(1.131f, 2.26f)
                curveToRelative(0.208f, 0.414f, 0.317f, 0.878f, 0.317f, 1.341f)
                verticalLineToRelative(0.591f)
                close()
            }
        }
        .build()
        return _bxShieldAlt!!
    }

private var _bxShieldAlt: ImageVector? = null
