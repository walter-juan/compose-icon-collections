package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Dpad: ImageVector
    get() {
        if (_dpad != null) {
            return _dpad!!
        }
        _dpad = Builder(name = "Dpad", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.788f, 2.34f)
                lineToRelative(-0.799f, 1.278f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 7.201f, 4.0f)
                horizontalLineToRelative(1.598f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.212f, -0.382f)
                lineToRelative(-0.799f, -1.279f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.424f, 0.0f)
                close()
                moveTo(7.788f, 13.66f)
                lineTo(6.989f, 12.383f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 7.201f, 12.0f)
                horizontalLineToRelative(1.598f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.212f, 0.383f)
                lineToRelative(-0.799f, 1.278f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.424f, 0.0f)
                close()
                moveTo(3.617f, 9.01f)
                lineTo(2.34f, 8.213f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.424f)
                lineToRelative(1.278f, -0.799f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 4.0f, 7.201f)
                lineTo(4.0f, 8.8f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.383f, 0.212f)
                close()
                moveTo(13.66f, 8.212f)
                lineTo(12.383f, 9.011f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 12.0f, 8.799f)
                lineTo(12.0f, 7.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.383f, -0.212f)
                lineToRelative(1.278f, 0.799f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.424f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 1.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 6.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 11.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 16.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 9.5f)
                verticalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 5.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 0.0f)
                close()
                moveTo(6.0f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 6.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 10.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 4.5f)
                close()
            }
        }
        .build()
        return _dpad!!
    }

private var _dpad: ImageVector? = null
