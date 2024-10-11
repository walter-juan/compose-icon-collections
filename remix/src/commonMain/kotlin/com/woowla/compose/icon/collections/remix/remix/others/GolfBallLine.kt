package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.GolfBallLine: ImageVector
    get() {
        if (_golfBallLine != null) {
            return _golfBallLine!!
        }
        _golfBallLine = Builder(name = "GolfBallLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.0f, 7.0f)
                curveTo(14.0f, 7.552f, 13.552f, 8.0f, 13.0f, 8.0f)
                curveTo(12.448f, 8.0f, 12.0f, 7.552f, 12.0f, 7.0f)
                curveTo(12.0f, 6.448f, 12.448f, 6.0f, 13.0f, 6.0f)
                curveTo(13.552f, 6.0f, 14.0f, 6.448f, 14.0f, 7.0f)
                close()
                moveTo(13.0f, 11.0f)
                curveTo(13.552f, 11.0f, 14.0f, 10.552f, 14.0f, 10.0f)
                curveTo(14.0f, 9.448f, 13.552f, 9.0f, 13.0f, 9.0f)
                curveTo(12.448f, 9.0f, 12.0f, 9.448f, 12.0f, 10.0f)
                curveTo(12.0f, 10.552f, 12.448f, 11.0f, 13.0f, 11.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.552f, 16.552f, 13.0f, 16.0f, 13.0f)
                curveTo(15.448f, 13.0f, 15.0f, 12.552f, 15.0f, 12.0f)
                curveTo(15.0f, 11.448f, 15.448f, 11.0f, 16.0f, 11.0f)
                curveTo(16.552f, 11.0f, 17.0f, 11.448f, 17.0f, 12.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(16.552f, 10.0f, 17.0f, 9.552f, 17.0f, 9.0f)
                curveTo(17.0f, 8.448f, 16.552f, 8.0f, 16.0f, 8.0f)
                curveTo(15.448f, 8.0f, 15.0f, 8.448f, 15.0f, 9.0f)
                curveTo(15.0f, 9.552f, 15.448f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _golfBallLine!!
    }

private var _golfBallLine: ImageVector? = null
