package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBall: ImageVector
    get() {
        if (_bxBall != null) {
            return _bxBall!!
        }
        _bxBall = Builder(name = "BxBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.76f, 21.0f)
                arcToRelative(17.68f, 17.68f, 0.0f, false, false, 4.0f, 0.43f)
                arcToRelative(13.89f, 13.89f, 0.0f, false, false, 9.93f, -3.69f)
                curveTo(23.0f, 12.37f, 21.06f, 4.11f, 21.0f, 3.76f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.76f, -0.76f)
                arcToRelative(17.91f, 17.91f, 0.0f, false, false, -4.0f, -0.43f)
                arcToRelative(13.82f, 13.82f, 0.0f, false, false, -9.96f, 3.71f)
                curveTo(0.94f, 11.63f, 2.94f, 19.89f, 3.0f, 20.24f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.76f, 0.76f)
                close()
                moveTo(7.7f, 7.7f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, true, 8.49f, -3.1f)
                arcToRelative(17.57f, 17.57f, 0.0f, false, true, 3.0f, 0.25f)
                curveToRelative(0.31f, 1.87f, 0.91f, 7.67f, -2.86f, 11.44f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, true, -8.55f, 3.11f)
                arcToRelative(17.16f, 17.16f, 0.0f, false, true, -2.93f, -0.25f)
                curveToRelative(-0.32f, -1.88f, -0.92f, -7.67f, 2.85f, -11.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.29f, 15.29f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-1.8f, -1.79f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-1.8f, -1.79f)
                lineToRelative(1.8f, -1.79f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-1.79f, 1.8f)
                lineToRelative(-1.79f, -1.8f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(1.8f, 1.79f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(-1.79f, -1.8f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(1.8f, 1.79f)
                close()
            }
        }
        .build()
        return _bxBall!!
    }

private var _bxBall: ImageVector? = null
