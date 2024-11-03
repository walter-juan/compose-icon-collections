package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.EvStationFill: ImageVector
    get() {
        if (_evStationFill != null) {
            return _evStationFill!!
        }
        _evStationFill = Builder(name = "EvStationFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(14.0f, 9.0f)
                curveToRelative(0.0f, -0.258f, -0.104f, -0.377f, -0.357f, -0.635f)
                lineToRelative(-0.007f, -0.008f)
                curveTo(13.379f, 8.096f, 13.0f, 7.71f, 13.0f, 7.0f)
                lineTo(13.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, -0.354f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(0.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 4.0f)
                verticalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                lineTo(12.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(0.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(1.0f, 15.0f)
                close()
                moveTo(3.0f, 2.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                moveToRelative(2.631f, 9.96f)
                lineTo(4.14f, 12.46f)
                verticalLineToRelative(-0.893f)
                horizontalLineToRelative(1.403f)
                verticalLineToRelative(-0.505f)
                lineTo(4.14f, 11.062f)
                verticalLineToRelative(-0.855f)
                horizontalLineToRelative(1.49f)
                verticalLineToRelative(-0.54f)
                lineTo(3.485f, 9.667f)
                lineTo(3.485f, 13.0f)
                horizontalLineToRelative(2.146f)
                close()
                moveTo(6.947f, 13.0f)
                horizontalLineToRelative(0.794f)
                lineToRelative(1.106f, -3.333f)
                horizontalLineToRelative(-0.733f)
                lineToRelative(-0.74f, 2.615f)
                horizontalLineToRelative(-0.031f)
                lineToRelative(-0.747f, -2.615f)
                horizontalLineToRelative(-0.764f)
                close()
            }
        }
        .build()
        return _evStationFill!!
    }

private var _evStationFill: ImageVector? = null
