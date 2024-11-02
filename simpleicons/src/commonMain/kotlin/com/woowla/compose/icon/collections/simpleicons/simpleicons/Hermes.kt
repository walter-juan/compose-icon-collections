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

public val Simpleicons.Hermes: ImageVector
    get() {
        if (_hermes != null) {
            return _hermes!!
        }
        _hermes = Builder(name = "Hermes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.818f, 4.516f)
                lineToRelative(-1.05f, 4.148f)
                horizontalLineToRelative(2.175f)
                lineTo(24.0f, 4.516f)
                moveTo(19.41f, 14.04f)
                horizontalLineToRelative(2.17f)
                lineToRelative(1.04f, -4.08f)
                horizontalLineToRelative(-2.178f)
                moveToRelative(-2.41f, 9.523f)
                horizontalLineToRelative(2.154f)
                lineToRelative(1.056f, -4.147f)
                horizontalLineToRelative(-2.16f)
                moveToRelative(0.193f, -5.377f)
                horizontalLineTo(5.55f)
                verticalLineToRelative(0.92f)
                lineToRelative(3.341f, 3.161f)
                horizontalLineToRelative(9.349f)
                moveToRelative(2.41f, -9.525f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.116f)
                lineToRelative(3.206f, 3.032f)
                horizontalLineTo(19.6f)
                moveToRelative(-8.372f, 7.58f)
                lineToRelative(3.43f, 3.24f)
                horizontalLineToRelative(2.205f)
                lineToRelative(1.05f, -4.147f)
                horizontalLineToRelative(-6.685f)
            }
        }
        .build()
        return _hermes!!
    }

private var _hermes: ImageVector? = null
