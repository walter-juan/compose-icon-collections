package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FiletypeRaw: ImageVector
    get() {
        if (_filetypeRaw != null) {
            return _filetypeRaw!!
        }
        _filetypeRaw = Builder(name = "FiletypeRaw", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 4.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                lineTo(9.5f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(1.597f, 11.85f)
                lineTo(0.0f, 11.85f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(0.782f)
                verticalLineToRelative(-1.491f)
                horizontalLineToRelative(0.71f)
                lineToRelative(0.7f, 1.491f)
                horizontalLineToRelative(1.651f)
                lineToRelative(0.313f, -1.028f)
                horizontalLineToRelative(1.336f)
                lineToRelative(0.314f, 1.028f)
                horizontalLineToRelative(0.84f)
                lineTo(5.31f, 11.85f)
                horizontalLineToRelative(-0.925f)
                lineToRelative(-1.329f, 3.96f)
                lineToRelative(-0.783f, -1.572f)
                arcTo(1.18f, 1.18f, 0.0f, false, false, 3.0f, 13.116f)
                quadToRelative(0.0f, -0.384f, -0.167f, -0.668f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.478f, -0.44f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.758f, -0.158f)
                moveToRelative(-0.815f, 1.913f)
                verticalLineToRelative(-1.292f)
                horizontalLineToRelative(0.7f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.507f, 0.17f)
                quadToRelative(0.194f, 0.17f, 0.194f, 0.49f)
                quadToRelative(0.0f, 0.315f, -0.194f, 0.474f)
                quadToRelative(-0.19f, 0.158f, -0.518f, 0.158f)
                close()
                moveTo(4.845f, 12.615f)
                lineTo(5.334f, 14.232f)
                lineTo(4.32f, 14.232f)
                lineToRelative(0.49f, -1.617f)
                close()
                moveTo(8.851f, 13.06f)
                lineTo(8.111f, 15.849f)
                horizontalLineToRelative(-0.73f)
                lineTo(6.326f, 11.85f)
                horizontalLineToRelative(0.855f)
                lineToRelative(0.601f, 2.903f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.706f, -2.903f)
                horizontalLineToRelative(0.683f)
                lineToRelative(0.706f, 2.903f)
                horizontalLineToRelative(0.04f)
                lineToRelative(0.596f, -2.903f)
                horizontalLineToRelative(0.858f)
                lineToRelative(-1.055f, 3.999f)
                horizontalLineToRelative(-0.73f)
                lineToRelative(-0.74f, -2.789f)
                lineTo(8.85f, 13.06f)
                close()
            }
        }
        .build()
        return _filetypeRaw!!
    }

private var _filetypeRaw: ImageVector? = null
