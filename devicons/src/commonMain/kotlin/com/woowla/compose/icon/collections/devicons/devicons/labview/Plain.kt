package com.woowla.compose.icon.collections.devicons.devicons.labview

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.LabviewGroup

public val LabviewGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.76f, 22.46f)
                curveToRelative(-4.42f, -0.09f, -8.06f, 2.99f, -8.06f, 6.81f)
                lineTo(21.7f, 41.8f)
                lineTo(3.54f, 41.8f)
                arcTo(3.54f, 3.54f, 0.0f, false, false, 0.0f, 45.34f)
                verticalLineToRelative(1.35f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, 3.53f)
                lineTo(21.7f, 50.22f)
                verticalLineToRelative(27.65f)
                lineTo(3.54f, 77.87f)
                arcTo(3.54f, 3.54f, 0.0f, false, false, 0.0f, 81.41f)
                verticalLineToRelative(1.34f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, 3.54f)
                lineTo(21.7f, 86.29f)
                verticalLineToRelative(12.42f)
                curveToRelative(0.0f, 5.25f, 6.56f, 8.53f, 11.81f, 5.91f)
                lineTo(103.0f, 69.9f)
                curveToRelative(0.89f, -0.44f, 1.61f, -1.01f, 2.2f, -1.64f)
                horizontalLineToRelative(19.26f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, -3.54f)
                verticalLineToRelative(-1.34f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -3.54f, -3.54f)
                horizontalLineToRelative(-19.15f)
                curveToRelative(-0.6f, -0.68f, -1.37f, -1.28f, -2.31f, -1.75f)
                lineTo(33.51f, 23.37f)
                arcToRelative(8.86f, 8.86f, 0.0f, false, false, -3.75f, -0.91f)
                close()
                moveTo(46.44f, 49.01f)
                horizontalLineToRelative(6.15f)
                lineTo(52.59f, 61.0f)
                horizontalLineToRelative(11.95f)
                verticalLineToRelative(6.08f)
                lineTo(52.59f, 67.08f)
                verticalLineToRelative(11.98f)
                horizontalLineToRelative(-6.15f)
                lineTo(46.44f, 67.08f)
                lineTo(34.49f, 67.08f)
                lineTo(34.49f, 61.0f)
                horizontalLineToRelative(11.96f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
