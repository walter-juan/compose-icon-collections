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

public val Simpleicons.Pomerium: ImageVector
    get() {
        if (_pomerium != null) {
            return _pomerium!!
        }
        _pomerium = Builder(name = "Pomerium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.768f)
                verticalLineToRelative(2.338f)
                lineToRelative(0.038f, -0.005f)
                arcTo(2.832f, 2.832f, 0.0f, false, true, 3.2f, 11.913f)
                verticalLineToRelative(7.998f)
                horizontalLineToRelative(2.318f)
                verticalLineToRelative(-9.023f)
                arcTo(2.687f, 2.687f, 0.0f, false, true, 7.95f, 8.213f)
                curveToRelative(1.288f, -0.123f, 2.345f, 0.873f, 2.345f, 2.167f)
                verticalLineToRelative(9.53f)
                horizontalLineToRelative(2.317f)
                verticalLineToRelative(-9.265f)
                curveToRelative(0.0f, -1.685f, 1.271f, -3.1f, 2.948f, -3.281f)
                curveToRelative(1.565f, -0.169f, 2.922f, 1.085f, 2.922f, 2.66f)
                verticalLineToRelative(9.886f)
                horizontalLineTo(20.8f)
                verticalLineToRelative(-9.875f)
                arcTo(3.635f, 3.635f, 0.0f, false, true, 24.0f, 6.422f)
                verticalLineTo(4.089f)
                close()
            }
        }
        .build()
        return _pomerium!!
    }

private var _pomerium: ImageVector? = null
