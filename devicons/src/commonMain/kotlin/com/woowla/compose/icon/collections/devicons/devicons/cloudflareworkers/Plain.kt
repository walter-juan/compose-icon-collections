package com.woowla.compose.icon.collections.devicons.devicons.cloudflareworkers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CloudflareworkersGroup

public val CloudflareworkersGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.74f, 116.26f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, -3.42f, -4.11f)
                lineTo(4.07f, 71.75f)
                arcToRelative(15.56f, 15.56f, 0.0f, false, true, 0.0f, -15.5f)
                lineTo(27.32f, 15.85f)
                arcToRelative(15.51f, 15.51f, 0.0f, false, true, 3.42f, -4.08f)
                lineToRelative(15.6f, 28.17f)
                lineToRelative(-11.27f, 20.28f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, 0.0f, 7.54f)
                lineToRelative(11.28f, 20.35f)
                lineToRelative(-15.61f, 28.15f)
                close()
                moveTo(100.67f, 15.85f)
                lineToRelative(23.25f, 40.4f)
                arcToRelative(15.48f, 15.48f, 0.0f, false, true, 0.0f, 15.5f)
                lineToRelative(-23.25f, 40.4f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, -13.42f, 7.75f)
                horizontalLineTo(68.99f)
                lineToRelative(28.92f, -52.15f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, 0.0f, -7.51f)
                lineTo(68.99f, 8.1f)
                horizontalLineToRelative(18.25f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, 13.42f, 7.75f)
                close()
                moveTo(36.12f, 9.14f)
                arcToRelative(15.51f, 15.51f, 0.0f, false, true, 5.56f, -1.04f)
                horizontalLineToRelative(21.25f)
                lineToRelative(28.92f, 52.15f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 0.0f, 7.51f)
                lineToRelative(-28.92f, 52.15f)
                horizontalLineTo(41.68f)
                curveToRelative(-2.06f, 0.0f, -4.12f, -0.42f, -5.99f, -1.19f)
                lineTo(63.41f, 67.29f)
                curveToRelative(0.89f, -1.61f, 1.0f, -4.74f, 0.11f, -6.35f)
                lineTo(36.12f, 9.14f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
