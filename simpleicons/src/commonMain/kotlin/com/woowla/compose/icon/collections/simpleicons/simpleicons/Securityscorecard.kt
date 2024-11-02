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

public val Simpleicons.Securityscorecard: ImageVector
    get() {
        if (_securityscorecard != null) {
            return _securityscorecard!!
        }
        _securityscorecard = Builder(name = "Securityscorecard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.37f, 2.501f)
                lineTo(12.001f, 5.0f)
                lineTo(7.63f, 7.501f)
                verticalLineToRelative(-5.0f)
                lineTo(12.001f, 0.0f)
                close()
                moveTo(22.487f, 6.0f)
                lineTo(22.49f, 10.986f)
                lineTo(13.762f, 5.993f)
                lineTo(18.118f, 3.5f)
                close()
                moveTo(18.118f, 15.508f)
                lineTo(18.117f, 20.505f)
                lineTo(22.494f, 18.005f)
                lineTo(22.492f, 12.987f)
                lineTo(18.118f, 10.485f)
                close()
                moveTo(7.627f, 21.502f)
                lineTo(12.001f, 24.0f)
                lineToRelative(4.369f, -2.495f)
                verticalLineToRelative(-4.997f)
                close()
                moveTo(7.63f, 9.5f)
                verticalLineToRelative(5.001f)
                lineToRelative(4.37f, 2.499f)
                lineToRelative(4.369f, -2.494f)
                lineTo(16.37f, 9.5f)
                lineToRelative(-4.369f, -2.499f)
                close()
                moveTo(1.505f, 18.004f)
                lineTo(1.508f, 12.999f)
                lineTo(10.255f, 18.002f)
                lineTo(5.879f, 20.502f)
                close()
                moveTo(5.881f, 3.5f)
                lineTo(1.513f, 6.001f)
                lineToRelative(-0.003f, 4.998f)
                lineToRelative(4.372f, 2.502f)
                close()
            }
        }
        .build()
        return _securityscorecard!!
    }

private var _securityscorecard: ImageVector? = null
