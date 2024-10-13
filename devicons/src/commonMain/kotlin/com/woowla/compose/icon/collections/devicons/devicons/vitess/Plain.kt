package com.woowla.compose.icon.collections.devicons.devicons.vitess

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VitessGroup

public val VitessGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 5.79f)
                lineToRelative(21.34f, 39.43f)
                lineToRelative(3.28f, -39.43f)
                close()
                moveTo(103.46f, 5.79f)
                lineTo(103.1f, 41.73f)
                lineTo(103.01f, 51.1f)
                lineTo(128.0f, 5.79f)
                close()
                moveTo(25.53f, 7.01f)
                lineToRelative(-3.2f, 38.53f)
                lineToRelative(15.3f, -16.41f)
                close()
                moveTo(102.43f, 7.3f)
                lineTo(90.35f, 29.36f)
                lineToRelative(11.65f, 21.76f)
                lineToRelative(0.34f, -34.64f)
                close()
                moveTo(38.25f, 30.27f)
                lineTo(26.85f, 51.45f)
                lineToRelative(6.82f, -5.42f)
                lineToRelative(9.18f, -7.29f)
                close()
                moveTo(89.86f, 30.6f)
                lineTo(73.57f, 75.96f)
                lineToRelative(14.8f, -12.03f)
                lineToRelative(13.47f, -10.95f)
                lineToRelative(-5.53f, -10.33f)
                close()
                moveTo(35.94f, 32.43f)
                lineTo(22.33f, 47.03f)
                lineTo(25.23f, 52.32f)
                close()
                moveTo(87.15f, 35.16f)
                lineTo(77.12f, 53.33f)
                lineToRelative(-3.17f, 18.58f)
                lineToRelative(7.66f, -21.33f)
                close()
                moveTo(42.82f, 40.05f)
                lineTo(25.88f, 53.51f)
                lineToRelative(12.05f, 22.12f)
                lineToRelative(0.51f, -3.68f)
                close()
                moveTo(43.79f, 40.47f)
                lineTo(38.84f, 76.42f)
                lineToRelative(18.7f, -7.72f)
                lineToRelative(1.26f, -0.52f)
                close()
                moveTo(100.78f, 55.15f)
                lineTo(73.91f, 76.99f)
                lineTo(88.7f, 76.98f)
                close()
                moveTo(75.62f, 56.09f)
                lineTo(64.51f, 76.54f)
                lineToRelative(5.63f, 10.35f)
                lineToRelative(1.82f, -9.33f)
                close()
                moveTo(58.78f, 69.28f)
                lineTo(38.93f, 77.48f)
                lineToRelative(12.1f, 22.31f)
                lineToRelative(0.45f, -1.79f)
                close()
                moveTo(59.69f, 69.81f)
                lineTo(52.01f, 100.05f)
                lineTo(69.81f, 88.58f)
                lineTo(69.83f, 88.45f)
                close()
                moveTo(88.14f, 77.99f)
                lineTo(72.9f, 78.01f)
                lineTo(71.06f, 88.79f)
                lineTo(71.06f, 88.79f)
                lineTo(64.64f, 120.56f)
                close()
                moveTo(69.53f, 89.98f)
                lineToRelative(-17.29f, 11.12f)
                lineToRelative(-0.37f, 0.24f)
                lineToRelative(11.39f, 20.87f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
