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

public val Simpleicons.Nobaralinux: ImageVector
    get() {
        if (_nobaralinux != null) {
            return _nobaralinux!!
        }
        _nobaralinux = Builder(name = "Nobaralinux", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.808f, 11.808f)
                verticalLineToRelative(8.281f)
                arcToRelative(3.542f, 3.542f, 0.0f, false, true, -3.542f, 3.527f)
                horizontalLineToRelative(-0.46f)
                arcToRelative(3.543f, 3.543f, 0.0f, false, true, -3.083f, -3.513f)
                verticalLineToRelative(-7.282f)
                lineToRelative(3.543f, -1.013f)
                lineToRelative(-3.66f, -1.045f)
                arcToRelative(4.724f, 4.724f, 0.0f, false, false, -9.33f, 1.045f)
                verticalLineToRelative(2.362f)
                arcToRelative(2.362f, 2.362f, 0.0f, false, false, 2.362f, 2.362f)
                arcToRelative(3.543f, 3.543f, 0.0f, false, true, 3.543f, 3.542f)
                lineTo(13.181f, 24.0f)
                arcToRelative(3.539f, 3.539f, 0.0f, false, false, -3.542f, -3.542f)
                arcToRelative(3.537f, 3.537f, 0.0f, false, false, -3.063f, 1.76f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, true, -2.382f, 1.398f)
                horizontalLineToRelative(-0.46f)
                arcTo(3.542f, 3.542f, 0.0f, false, true, 0.192f, 20.09f)
                lineTo(0.192f, 3.543f)
                arcToRelative(3.542f, 3.542f, 0.0f, false, true, 6.323f, -2.194f)
                arcTo(11.756f, 11.756f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(6.521f, 0.0f, 11.808f, 5.287f, 11.808f, 11.808f)
                close()
                moveTo(14.362f, 11.808f)
                arcTo(2.359f, 2.359f, 0.0f, false, true, 12.0f, 14.17f)
                arcToRelative(2.362f, 2.362f, 0.0f, true, true, 2.362f, -2.362f)
                close()
            }
        }
        .build()
        return _nobaralinux!!
    }

private var _nobaralinux: ImageVector? = null
