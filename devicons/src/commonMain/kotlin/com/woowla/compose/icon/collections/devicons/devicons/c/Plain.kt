package com.woowla.compose.icon.collections.devicons.devicons.c

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CGroup

public val CGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF03599C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.5f, 33.5f)
                lineToRelative(0.3f, -0.2f)
                curveToRelative(-0.6f, -1.1f, -1.5f, -2.1f, -2.4f, -2.6f)
                lineTo(67.1f, 2.9f)
                curveToRelative(-0.8f, -0.5f, -1.9f, -0.7f, -3.1f, -0.7f)
                curveToRelative(-1.2f, 0.0f, -2.3f, 0.3f, -3.1f, 0.7f)
                lineToRelative(-48.0f, 27.9f)
                curveToRelative(-1.7f, 1.0f, -2.9f, 3.5f, -2.9f, 5.4f)
                verticalLineToRelative(55.7f)
                curveToRelative(0.0f, 1.1f, 0.2f, 2.3f, 0.9f, 3.4f)
                lineToRelative(-0.2f, 0.1f)
                curveToRelative(0.5f, 0.8f, 1.2f, 1.5f, 1.9f, 1.9f)
                lineToRelative(48.2f, 27.9f)
                curveToRelative(0.8f, 0.5f, 1.9f, 0.7f, 3.1f, 0.7f)
                curveToRelative(1.2f, 0.0f, 2.3f, -0.3f, 3.1f, -0.7f)
                lineToRelative(48.0f, -27.9f)
                curveToRelative(1.7f, -1.0f, 2.9f, -3.5f, 2.9f, -5.4f)
                verticalLineTo(36.1f)
                curveToRelative(0.1f, -0.8f, 0.0f, -1.7f, -0.4f, -2.6f)
                close()
                moveTo(64.0f, 88.5f)
                curveToRelative(9.1f, 0.0f, 17.1f, -5.0f, 21.3f, -12.4f)
                lineToRelative(12.9f, 7.6f)
                curveToRelative(-6.8f, 11.8f, -19.6f, 19.8f, -34.2f, 19.8f)
                curveToRelative(-21.8f, 0.0f, -39.5f, -17.7f, -39.5f, -39.5f)
                reflectiveCurveTo(42.2f, 24.5f, 64.0f, 24.5f)
                curveToRelative(14.7f, 0.0f, 27.5f, 8.1f, 34.3f, 20.0f)
                lineToRelative(-13.0f, 7.5f)
                curveTo(81.1f, 44.5f, 73.1f, 39.5f, 64.0f, 39.5f)
                curveToRelative(-13.5f, 0.0f, -24.5f, 11.0f, -24.5f, 24.5f)
                reflectiveCurveToRelative(11.0f, 24.5f, 24.5f, 24.5f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
