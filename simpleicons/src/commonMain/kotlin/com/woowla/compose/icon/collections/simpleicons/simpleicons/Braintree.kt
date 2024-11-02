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

public val Simpleicons.Braintree: ImageVector
    get() {
        if (_braintree != null) {
            return _braintree!!
        }
        _braintree = Builder(name = "Braintree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.276f, 20.482f)
                horizontalLineToRelative(4.717f)
                curveToRelative(3.641f, 0.0f, 5.462f, -1.2f, 5.462f, -3.517f)
                curveToRelative(0.0f, -2.275f, -1.945f, -3.517f, -5.752f, -3.517f)
                lineTo(8.276f, 13.448f)
                close()
                moveTo(8.276f, 3.517f)
                verticalLineToRelative(6.538f)
                horizontalLineToRelative(4.138f)
                curveToRelative(3.103f, 0.0f, 4.717f, -1.159f, 4.717f, -3.269f)
                curveToRelative(0.0f, -2.152f, -1.655f, -3.269f, -4.759f, -3.269f)
                close()
                moveTo(1.696f, 24.0f)
                verticalLineToRelative(-3.518f)
                lineTo(4.47f, 20.482f)
                lineTo(4.47f, 3.517f)
                lineTo(1.697f, 3.517f)
                lineTo(1.697f, 0.0f)
                horizontalLineToRelative(11.089f)
                curveToRelative(5.09f, 0.0f, 8.193f, 2.358f, 8.193f, 6.455f)
                curveToRelative(0.0f, 2.69f, -1.572f, 4.345f, -3.558f, 5.131f)
                curveToRelative(2.855f, 0.787f, 4.882f, 2.814f, 4.882f, 5.586f)
                curveToRelative(0.0f, 4.386f, -3.393f, 6.828f, -8.938f, 6.828f)
                lineTo(1.697f, 24.0f)
            }
        }
        .build()
        return _braintree!!
    }

private var _braintree: ImageVector? = null
