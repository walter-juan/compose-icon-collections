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

public val Twbs.MicMuteFill: ImageVector
    get() {
        if (_micMuteFill != null) {
            return _micMuteFill!!
        }
        _micMuteFill = Builder(name = "MicMuteFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                curveToRelative(0.0f, 0.564f, -0.094f, 1.107f, -0.266f, 1.613f)
                lineToRelative(-0.814f, -0.814f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.0f)
                lineTo(12.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(0.818f, 0.0f, 1.578f, -0.245f, 2.212f, -0.667f)
                lineToRelative(0.718f, 0.719f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.43f, 0.923f)
                lineTo(8.5f, 15.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.025f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 3.0f, 8.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                moveToRelative(3.0f, -9.0f)
                verticalLineToRelative(4.879f)
                lineTo(5.158f, 2.037f)
                arcTo(3.001f, 3.001f, 0.0f, false, true, 11.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.486f, 10.607f)
                lineTo(5.0f, 6.12f)
                verticalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.486f, 2.607f)
                moveToRelative(-7.84f, -9.253f)
                lineToRelative(12.0f, 12.0f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _micMuteFill!!
    }

private var _micMuteFill: ImageVector? = null
