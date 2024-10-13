package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCricketBall: ImageVector
    get() {
        if (_bxsCricketBall != null) {
            return _bxsCricketBall!!
        }
        _bxsCricketBall = Builder(name = "BxsCricketBall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.67f, 16.26f)
                lineToRelative(0.54f, 0.53f)
                lineToRelative(-0.62f, 0.61f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.84f, 1.11f)
                lineTo(18.51f, 4.42f)
                arcToRelative(10.93f, 10.93f, 0.0f, false, false, -1.1f, -0.83f)
                lineToRelative(-0.62f, 0.61f)
                lineToRelative(-0.53f, -0.53f)
                lineToRelative(0.48f, -0.48f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 3.2f, 16.74f)
                close()
                moveTo(14.86f, 5.07f)
                lineToRelative(0.53f, 0.53f)
                lineTo(14.0f, 7.0f)
                lineToRelative(-0.53f, -0.53f)
                close()
                moveTo(12.07f, 7.87f)
                lineTo(12.59f, 8.4f)
                lineTo(11.2f, 9.8f)
                lineTo(10.67f, 9.27f)
                close()
                moveTo(9.27f, 10.67f)
                lineTo(9.8f, 11.2f)
                lineTo(8.4f, 12.59f)
                lineTo(7.87f, 12.06f)
                close()
                moveTo(6.47f, 13.46f)
                lineTo(7.0f, 14.0f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(-0.53f, -0.53f)
                close()
                moveTo(6.59f, 20.41f)
                lineTo(7.21f, 19.8f)
                lineTo(7.74f, 20.33f)
                lineTo(7.26f, 20.81f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 20.8f, 7.26f)
                lineToRelative(-0.47f, 0.48f)
                lineToRelative(-0.54f, -0.53f)
                lineToRelative(0.62f, -0.61f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.84f, -1.11f)
                lineTo(5.49f, 19.58f)
                arcToRelative(10.93f, 10.93f, 0.0f, false, false, 1.1f, 0.83f)
                close()
                moveTo(18.4f, 8.61f)
                lineToRelative(0.53f, 0.53f)
                lineToRelative(-1.4f, 1.4f)
                lineTo(17.0f, 10.0f)
                close()
                moveTo(15.6f, 11.41f)
                lineTo(16.13f, 11.94f)
                lineTo(14.73f, 13.33f)
                lineTo(14.2f, 12.8f)
                close()
                moveTo(12.8f, 14.2f)
                lineTo(13.33f, 14.73f)
                lineTo(11.94f, 16.13f)
                lineTo(11.4f, 15.6f)
                close()
                moveTo(10.0f, 17.0f)
                lineToRelative(0.53f, 0.53f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(-0.53f, -0.53f)
                close()
            }
        }
        .build()
        return _bxsCricketBall!!
    }

private var _bxsCricketBall: ImageVector? = null
