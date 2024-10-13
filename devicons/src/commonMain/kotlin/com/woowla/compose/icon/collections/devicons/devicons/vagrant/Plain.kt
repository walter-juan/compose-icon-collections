package com.woowla.compose.icon.collections.devicons.devicons.vagrant

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
import com.woowla.compose.icon.collections.devicons.devicons.VagrantGroup

public val VagrantGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.51f, 23.9f)
                verticalLineTo(12.82f)
                lineToRelative(-26.6f, 15.47f)
                verticalLineToRelative(9.35f)
                lineTo(74.64f, 83.55f)
                lineToRelative(-10.65f, 7.33f)
                verticalLineToRelative(33.61f)
                lineToRelative(22.81f, -13.15f)
                lineToRelative(35.71f, -87.44f)
                close()
                moveTo(63.99f, 66.94f)
                lineTo(48.04f, 29.71f)
                verticalLineTo(19.18f)
                lineToRelative(-0.11f, -0.05f)
                lineToRelative(-15.85f, 9.16f)
                verticalLineToRelative(9.35f)
                lineToRelative(21.28f, 47.92f)
                lineToRelative(10.63f, -5.26f)
                verticalLineTo(66.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.56f, 3.51f)
                lineTo(79.97f, 19.08f)
                lineToRelative(-0.02f, -0.01f)
                verticalLineTo(29.71f)
                lineTo(63.99f, 66.94f)
                verticalLineToRelative(12.45f)
                lineToRelative(-10.63f, 6.17f)
                lineToRelative(-21.28f, -47.92f)
                verticalLineToRelative(-9.37f)
                lineToRelative(15.97f, -9.18f)
                lineToRelative(-26.6f, -15.58f)
                lineToRelative(-15.96f, 9.31f)
                verticalLineToRelative(11.41f)
                lineToRelative(35.91f, 87.21f)
                lineToRelative(22.59f, 13.05f)
                verticalLineTo(91.73f)
                lineToRelative(10.65f, -6.17f)
                lineToRelative(-0.14f, -0.08f)
                lineToRelative(21.41f, -47.84f)
                verticalLineToRelative(-9.35f)
                lineToRelative(0.01f, -0.02f)
                lineToRelative(26.59f, -15.45f)
                lineToRelative(-15.95f, -9.31f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
