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

public val Simpleicons.Zsh: ImageVector
    get() {
        if (_zsh != null) {
            return _zsh!!
        }
        _zsh = Builder(name = "Zsh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.415f, 5.038f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -0.543f, 0.197f)
                lineTo(0.135f, 18.021f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.071f, 0.814f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.815f, -0.07f)
                lineTo(11.757f, 5.979f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -0.07f, -0.815f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.272f, -0.126f)
                moveToRelative(-8.113f, 0.317f)
                arcToRelative(3.133f, 3.133f, 0.0f, false, false, -3.12f, 3.12f)
                arcToRelative(3.13f, 3.13f, 0.0f, false, false, 3.12f, 3.119f)
                arcTo(3.133f, 3.133f, 0.0f, false, false, 6.42f, 8.475f)
                arcToRelative(3.13f, 3.13f, 0.0f, false, false, -3.119f, -3.119f)
                moveToRelative(0.0f, 1.806f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.314f, 1.313f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.314f, 1.312f)
                arcTo(1.3f, 1.3f, 0.0f, false, true, 1.99f, 8.475f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.312f, -1.314f)
                moveToRelative(5.253f, 5.253f)
                arcToRelative(3.13f, 3.13f, 0.0f, false, false, -3.119f, 3.119f)
                arcToRelative(3.13f, 3.13f, 0.0f, false, false, 3.12f, 3.118f)
                arcToRelative(3.133f, 3.133f, 0.0f, false, false, 3.118f, -3.12f)
                arcToRelative(3.133f, 3.133f, 0.0f, false, false, -3.119f, -3.118f)
                moveToRelative(0.0f, 1.805f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.313f, 1.314f)
                curveToRelative(0.0f, 0.735f, -0.577f, 1.312f, -1.312f, 1.312f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.314f, -1.312f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.313f, -1.314f)
                moveToRelative(7.201f, 3.276f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -0.578f, 0.578f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.578f, 0.578f)
                horizontalLineToRelative(7.666f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.579f, -0.578f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -0.579f, -0.578f)
                close()
            }
        }
        .build()
        return _zsh!!
    }

private var _zsh: ImageVector? = null
