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

public val Simpleicons.Trakt: ImageVector
    get() {
        if (_trakt != null) {
            return _trakt!!
        }
        _trakt = Builder(name = "Trakt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.082f, 15.107f)
                lineToRelative(-0.73f, -0.73f)
                lineToRelative(9.578f, -9.583f)
                arcToRelative(4.499f, 4.499f, 0.0f, false, false, -0.115f, -0.575f)
                lineTo(13.662f, 14.382f)
                lineToRelative(1.08f, 1.08f)
                lineToRelative(-0.73f, 0.73f)
                lineToRelative(-1.81f, -1.81f)
                lineTo(23.422f, 3.144f)
                curveToRelative(-0.075f, -0.15f, -0.155f, -0.3f, -0.25f, -0.44f)
                lineTo(11.508f, 14.377f)
                lineToRelative(2.154f, 2.155f)
                lineToRelative(-0.73f, 0.73f)
                lineToRelative(-7.193f, -7.199f)
                lineToRelative(0.73f, -0.73f)
                lineToRelative(4.309f, 4.31f)
                lineTo(22.546f, 1.86f)
                arcTo(5.618f, 5.618f, 0.0f, false, false, 18.362f, 0.0f)
                lineTo(5.635f, 0.0f)
                arcTo(5.637f, 5.637f, 0.0f, false, false, 0.0f, 5.634f)
                lineTo(0.0f, 18.37f)
                arcTo(5.632f, 5.632f, 0.0f, false, false, 5.635f, 24.0f)
                horizontalLineToRelative(12.732f)
                curveTo(21.477f, 24.0f, 24.0f, 21.48f, 24.0f, 18.37f)
                lineTo(24.0f, 6.19f)
                lineToRelative(-8.913f, 8.918f)
                close()
                moveTo(10.768f, 12.952f)
                lineTo(6.814f, 8.988f)
                lineToRelative(0.73f, -0.73f)
                lineToRelative(3.954f, 3.96f)
                close()
                moveTo(11.843f, 11.868f)
                lineTo(7.889f, 7.908f)
                lineTo(8.619f, 7.178f)
                lineTo(12.578f, 11.138f)
                close()
                moveTo(21.696f, 17.556f)
                arcToRelative(4.141f, 4.141f, 0.0f, false, true, -4.14f, 4.14f)
                lineTo(6.438f, 21.696f)
                arcToRelative(4.144f, 4.144f, 0.0f, false, true, -4.139f, -4.14f)
                lineTo(2.299f, 6.438f)
                arcTo(4.141f, 4.141f, 0.0f, false, true, 6.44f, 2.3f)
                horizontalLineToRelative(10.387f)
                verticalLineToRelative(1.04f)
                lineTo(6.438f, 3.34f)
                curveToRelative(-1.71f, 0.0f, -3.099f, 1.39f, -3.099f, 3.1f)
                lineTo(3.339f, 17.55f)
                curveToRelative(0.0f, 1.71f, 1.39f, 3.105f, 3.1f, 3.105f)
                horizontalLineToRelative(11.117f)
                curveToRelative(1.71f, 0.0f, 3.1f, -1.395f, 3.1f, -3.105f)
                verticalLineToRelative(-1.754f)
                horizontalLineToRelative(1.04f)
                verticalLineToRelative(1.754f)
                close()
            }
        }
        .build()
        return _trakt!!
    }

private var _trakt: ImageVector? = null
