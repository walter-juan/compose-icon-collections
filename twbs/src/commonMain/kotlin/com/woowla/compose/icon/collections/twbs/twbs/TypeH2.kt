package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TypeH2: ImageVector
    get() {
        if (_typeH2 != null) {
            return _typeH2!!
        }
        _typeH2 = Builder(name = "TypeH2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.495f, 13.0f)
                lineTo(7.495f, 3.201f)
                lineTo(6.174f, 3.201f)
                verticalLineToRelative(4.15f)
                lineTo(1.32f, 7.351f)
                lineTo(1.32f, 3.2f)
                lineTo(0.0f, 3.2f)
                lineTo(0.0f, 13.0f)
                horizontalLineToRelative(1.32f)
                lineTo(1.32f, 8.513f)
                horizontalLineToRelative(4.854f)
                lineTo(6.174f, 13.0f)
                close()
                moveTo(10.669f, 5.929f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0.0f, -0.934f, 0.66f, -1.752f, 1.801f, -1.752f)
                curveToRelative(1.005f, 0.0f, 1.76f, 0.639f, 1.76f, 1.651f)
                curveToRelative(0.0f, 0.898f, -0.582f, 1.58f, -1.12f, 2.19f)
                lineToRelative(-3.69f, 4.2f)
                lineTo(9.42f, 13.0f)
                horizontalLineToRelative(6.331f)
                verticalLineToRelative(-1.149f)
                horizontalLineToRelative(-4.458f)
                verticalLineToRelative(-0.079f)
                lineTo(13.9f, 8.786f)
                curveToRelative(0.919f, -1.048f, 1.666f, -1.874f, 1.666f, -3.101f)
                curveTo(15.565f, 4.149f, 14.35f, 3.0f, 12.499f, 3.0f)
                curveTo(10.46f, 3.0f, 9.384f, 4.393f, 9.384f, 5.879f)
                verticalLineToRelative(0.05f)
                close()
            }
        }
        .build()
        return _typeH2!!
    }

private var _typeH2: ImageVector? = null
