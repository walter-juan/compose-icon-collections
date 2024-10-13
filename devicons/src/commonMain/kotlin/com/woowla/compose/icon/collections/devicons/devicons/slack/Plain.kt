package com.woowla.compose.icon.collections.devicons.devicons.slack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SlackGroup

public val SlackGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.15f, 80.77f)
                curveToRelative(0.0f, 7.35f, -5.99f, 13.35f, -13.35f, 13.35f)
                curveTo(6.45f, 94.12f, 0.45f, 88.12f, 0.45f, 80.77f)
                curveToRelative(0.0f, -7.35f, 6.0f, -13.35f, 13.35f, -13.35f)
                lineTo(27.15f, 67.41f)
                close()
                moveTo(33.88f, 80.77f)
                curveToRelative(0.0f, -7.35f, 6.0f, -13.35f, 13.35f, -13.35f)
                curveToRelative(7.35f, 0.0f, 13.35f, 6.0f, 13.35f, 13.35f)
                verticalLineToRelative(33.43f)
                curveToRelative(0.0f, 7.35f, -6.0f, 13.35f, -13.35f, 13.35f)
                curveToRelative(-7.35f, 0.0f, -13.35f, -6.0f, -13.35f, -13.35f)
                verticalLineToRelative(-33.43f)
                close()
                moveTo(47.23f, 27.15f)
                curveToRelative(-7.35f, 0.0f, -13.35f, -5.99f, -13.35f, -13.35f)
                curveTo(33.88f, 6.45f, 39.88f, 0.45f, 47.23f, 0.45f)
                curveToRelative(7.35f, 0.0f, 13.35f, 6.0f, 13.35f, 13.35f)
                lineTo(60.59f, 27.15f)
                close()
                moveTo(47.23f, 33.88f)
                curveToRelative(7.35f, 0.0f, 13.35f, 6.0f, 13.35f, 13.35f)
                curveToRelative(0.0f, 7.35f, -6.0f, 13.35f, -13.35f, 13.35f)
                horizontalLineToRelative(-33.43f)
                curveTo(6.45f, 60.59f, 0.45f, 54.58f, 0.45f, 47.23f)
                curveToRelative(0.0f, -7.35f, 6.0f, -13.35f, 13.35f, -13.35f)
                horizontalLineToRelative(33.43f)
                close()
                moveTo(100.85f, 47.23f)
                curveToRelative(0.0f, -7.35f, 5.99f, -13.35f, 13.35f, -13.35f)
                curveToRelative(7.35f, 0.0f, 13.35f, 6.0f, 13.35f, 13.35f)
                curveToRelative(0.0f, 7.35f, -6.0f, 13.35f, -13.35f, 13.35f)
                lineTo(100.85f, 60.59f)
                close()
                moveTo(94.12f, 47.23f)
                curveToRelative(0.0f, 7.35f, -6.0f, 13.35f, -13.35f, 13.35f)
                curveToRelative(-7.35f, 0.0f, -13.35f, -6.0f, -13.35f, -13.35f)
                verticalLineToRelative(-33.43f)
                curveTo(67.41f, 6.45f, 73.42f, 0.45f, 80.77f, 0.45f)
                curveToRelative(7.35f, 0.0f, 13.35f, 6.0f, 13.35f, 13.35f)
                close()
                moveTo(80.77f, 100.85f)
                curveToRelative(7.35f, 0.0f, 13.35f, 5.99f, 13.35f, 13.35f)
                curveToRelative(0.0f, 7.35f, -6.0f, 13.35f, -13.35f, 13.35f)
                curveToRelative(-7.35f, 0.0f, -13.35f, -6.0f, -13.35f, -13.35f)
                lineTo(67.41f, 100.85f)
                close()
                moveTo(80.77f, 94.12f)
                curveToRelative(-7.35f, 0.0f, -13.35f, -6.0f, -13.35f, -13.35f)
                curveToRelative(0.0f, -7.35f, 6.0f, -13.35f, 13.35f, -13.35f)
                horizontalLineToRelative(33.43f)
                curveToRelative(7.35f, 0.0f, 13.35f, 6.0f, 13.35f, 13.35f)
                curveToRelative(0.0f, 7.35f, -6.0f, 13.35f, -13.35f, 13.35f)
                close()
                moveTo(80.77f, 94.12f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
