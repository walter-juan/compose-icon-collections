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

public val Simpleicons.Bazel: ImageVector
    get() {
        if (_bazel != null) {
            return _bazel!!
        }
        _bazel = Builder(name = "Bazel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.747f, 23.82f)
                lineToRelative(-5.499f, -5.499f)
                verticalLineToRelative(-5.535f)
                lineToRelative(5.499f, 5.499f)
                verticalLineToRelative(5.535f)
                close()
                moveTo(11.644f, 6.179f)
                lineTo(11.644f, 6.179f)
                lineTo(11.82f, 6.002f)
                lineTo(5.999f, 0.18f)
                lineTo(0.177f, 6.002f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(5.822f, 5.827f)
                lineToRelative(5.645f, -5.65f)
                close()
                moveTo(0.0f, 6.532f)
                verticalLineToRelative(5.535f)
                lineToRelative(5.749f, 5.754f)
                verticalLineToRelative(-5.535f)
                lineToRelative(-0.104f, -0.104f)
                lineToRelative(0.0f, -0.0f)
                lineTo(0.0f, 6.532f)
                close()
                moveTo(17.648f, 12.183f)
                lineTo(11.997f, 6.532f)
                lineTo(6.352f, 12.183f)
                lineTo(11.997f, 17.828f)
                lineTo(17.648f, 12.183f)
                close()
                moveTo(17.751f, 18.071f)
                verticalLineToRelative(-5.285f)
                lineToRelative(-5.504f, 5.499f)
                verticalLineToRelative(5.535f)
                lineToRelative(5.504f, -5.499f)
                verticalLineToRelative(-0.25f)
                close()
                moveTo(24.0f, 6.532f)
                lineToRelative(-5.645f, 5.65f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-0.104f, 0.104f)
                verticalLineToRelative(5.535f)
                lineTo(24.0f, 12.067f)
                lineTo(24.0f, 6.532f)
                close()
                moveTo(23.823f, 6.002f)
                lineTo(23.823f, 6.002f)
                lineTo(18.001f, 0.18f)
                lineToRelative(-5.827f, 5.822f)
                lineToRelative(5.827f, 5.827f)
                lineToRelative(5.822f, -5.827f)
                close()
            }
        }
        .build()
        return _bazel!!
    }

private var _bazel: ImageVector? = null
