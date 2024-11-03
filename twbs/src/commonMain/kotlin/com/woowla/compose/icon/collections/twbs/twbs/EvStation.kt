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

public val Twbs.EvStation: ImageVector
    get() {
        if (_evStation != null) {
            return _evStation!!
        }
        _evStation = Builder(name = "EvStation", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(5.631f, 12.46f)
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                lineTo(0.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(11.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(15.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.354f)
                lineToRelative(-0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                lineToRelative(-0.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.71f, 0.38f, 1.096f, 0.636f, 1.357f)
                lineToRelative(0.007f, 0.008f)
                curveToRelative(0.253f, 0.258f, 0.357f, 0.377f, 0.357f, 0.635f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(13.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(11.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(10.0f, 2.0f)
                verticalLineToRelative(13.0f)
                lineTo(2.0f, 15.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
            }
        }
        .build()
        return _evStation!!
    }

private var _evStation: ImageVector? = null
