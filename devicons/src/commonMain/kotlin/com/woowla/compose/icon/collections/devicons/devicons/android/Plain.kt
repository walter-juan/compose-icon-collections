package com.woowla.compose.icon.collections.devicons.devicons.android

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AndroidGroup

public val AndroidGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFA4C439)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 43.0f)
                curveToRelative(-4.05f, -0.0f, -7.34f, 3.29f, -7.34f, 7.34f)
                lineToRelative(0.0f, 30.74f)
                arcToRelative(7.34f, 7.34f, 0.0f, false, false, 7.34f, 7.34f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, false, 7.34f, -7.34f)
                lineTo(28.35f, 50.34f)
                arcToRelative(7.34f, 7.34f, 0.0f, false, false, -7.35f, -7.34f)
                moveToRelative(59.19f, -27.6f)
                lineToRelative(5.12f, -9.35f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, false, -0.4f, -1.39f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, false, -1.38f, 0.41f)
                lineToRelative(-5.18f, 9.45f)
                curveToRelative(-4.35f, -1.94f, -9.23f, -3.02f, -14.38f, -3.02f)
                curveToRelative(-5.14f, -0.0f, -10.01f, 1.08f, -14.35f, 3.01f)
                lineTo(44.45f, 5.07f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -1.38f, -0.41f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.4f, 1.38f)
                lineToRelative(5.13f, 9.35f)
                curveToRelative(-10.07f, 5.19f, -16.87f, 15.08f, -16.87f, 26.44f)
                lineToRelative(66.12f, -0.01f)
                curveToRelative(0.0f, -11.35f, -6.79f, -21.22f, -16.84f, -26.43f)
                moveTo(48.94f, 29.86f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, true, 0.0f, -5.55f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, 2.78f, 2.77f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, -2.78f, 2.77f)
                moveToRelative(30.11f, -0.0f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, true, -2.77f, -2.77f)
                arcToRelative(2.79f, 2.79f, 0.0f, false, true, 2.77f, -2.78f)
                arcToRelative(2.79f, 2.79f, 0.0f, false, true, 2.77f, 2.78f)
                arcToRelative(2.77f, 2.77f, 0.0f, false, true, -2.77f, 2.77f)
                moveTo(31.19f, 44.39f)
                lineToRelative(0.01f, 47.63f)
                arcToRelative(7.82f, 7.82f, 0.0f, false, false, 7.83f, 7.83f)
                lineToRelative(5.33f, 0.0f)
                lineToRelative(0.01f, 16.26f)
                curveToRelative(-0.0f, 4.05f, 3.29f, 7.34f, 7.34f, 7.34f)
                curveToRelative(4.06f, 0.0f, 7.34f, -3.3f, 7.34f, -7.35f)
                lineToRelative(-0.0f, -16.26f)
                lineToRelative(9.91f, -0.0f)
                lineToRelative(0.0f, 16.26f)
                curveToRelative(0.0f, 4.05f, 3.29f, 7.35f, 7.34f, 7.34f)
                curveToRelative(4.06f, 0.0f, 7.34f, -3.29f, 7.34f, -7.34f)
                lineToRelative(-0.0f, -16.26f)
                lineToRelative(5.35f, -0.0f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, false, 7.84f, -7.83f)
                lineToRelative(-0.01f, -47.63f)
                lineToRelative(-65.62f, 0.01f)
                close()
                moveTo(114.33f, 50.33f)
                arcToRelative(7.34f, 7.34f, 0.0f, false, false, -7.34f, -7.34f)
                curveToRelative(-4.05f, -0.0f, -7.34f, 3.29f, -7.34f, 7.34f)
                lineToRelative(0.01f, 30.74f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, false, 7.34f, 7.34f)
                arcToRelative(7.34f, 7.34f, 0.0f, false, false, 7.34f, -7.34f)
                lineToRelative(-0.0f, -30.74f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
