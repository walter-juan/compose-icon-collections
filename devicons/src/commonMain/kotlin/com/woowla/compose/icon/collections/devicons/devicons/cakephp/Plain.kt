package com.woowla.compose.icon.collections.devicons.devicons.cakephp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CakephpGroup

public val CakephpGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFd43d44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 73.69f)
                verticalLineTo(93.0f)
                curveToRelative(0.0f, 10.69f, 27.75f, 19.35f, 62.0f, 19.35f)
                verticalLineTo(93.0f)
                curveTo(29.75f, 93.0f, 2.0f, 84.36f, 2.0f, 73.69f)
                close()
                moveTo(64.0f, 54.34f)
                lineToRelative(48.5f, 12.0f)
                curveToRelative(8.44f, -3.3f, 13.51f, -7.5f, 13.51f, -12.0f)
                verticalLineTo(35.0f)
                curveToRelative(0.0f, -10.68f, -27.76f, -19.35f, -62.0f, -19.35f)
                reflectiveCurveTo(2.0f, 24.29f, 2.0f, 35.0f)
                verticalLineToRelative(19.34f)
                curveTo(2.0f, 65.0f, 29.75f, 73.69f, 64.0f, 73.69f)
                verticalLineTo(54.34f)
                close()
                moveTo(112.49f, 85.74f)
                lineTo(64.0f, 73.69f)
                verticalLineTo(93.0f)
                lineToRelative(48.5f, 12.05f)
                curveToRelative(8.43f, -3.27f, 13.5f, -7.46f, 13.5f, -12.05f)
                verticalLineTo(73.69f)
                curveToRelative(0.0f, 4.55f, -5.07f, 8.74f, -13.51f, 12.05f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
