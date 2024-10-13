package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCricketBall: ImageVector
    get() {
        if (_bxCricketBall != null) {
            return _bxCricketBall!!
        }
        _bxCricketBall = Builder(name = "BxCricketBall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.07f, 4.93f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 4.93f, 19.07f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 19.07f, 4.93f)
                close()
                moveTo(6.34f, 6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.78f, -1.71f)
                lineToRelative(-0.29f, 0.3f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(0.52f, -0.53f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, 0.84f, 0.57f)
                lineTo(5.68f, 16.9f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, -0.57f, -0.84f)
                lineToRelative(0.53f, -0.52f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-0.29f, 0.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.7f, -8.78f)
                close()
                moveTo(17.66f, 17.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.78f, 1.71f)
                lineToRelative(0.29f, -0.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-0.52f, 0.53f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, -0.84f, -0.57f)
                lineTo(18.32f, 7.1f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, 0.57f, 0.84f)
                lineToRelative(-0.53f, 0.52f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(0.29f, -0.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.7f, 8.78f)
                close()
                moveTo(11.29f, 15.54f)
                lineTo(12.0f, 16.24f)
                lineTo(10.59f, 17.66f)
                lineTo(9.88f, 17.0f)
                close()
                moveTo(14.12f, 12.71f)
                lineTo(14.83f, 13.41f)
                lineTo(13.41f, 14.83f)
                lineTo(12.71f, 14.12f)
                close()
                moveTo(17.0f, 9.88f)
                lineToRelative(0.71f, 0.71f)
                lineTo(16.24f, 12.0f)
                lineToRelative(-0.7f, -0.71f)
                close()
                moveTo(12.71f, 8.46f)
                lineTo(12.0f, 7.76f)
                lineTo(13.41f, 6.34f)
                lineTo(14.12f, 7.05f)
                close()
                moveTo(9.88f, 11.29f)
                lineTo(9.17f, 10.59f)
                lineTo(10.59f, 9.17f)
                lineTo(11.29f, 9.88f)
                close()
                moveTo(7.05f, 14.12f)
                lineTo(6.34f, 13.41f)
                lineTo(7.76f, 12.0f)
                lineToRelative(0.7f, 0.71f)
                close()
            }
        }
        .build()
        return _bxCricketBall!!
    }

private var _bxCricketBall: ImageVector? = null
