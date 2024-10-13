package com.woowla.compose.icon.collections.devicons.devicons.dropwizard

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.DropwizardGroup

public val DropwizardGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF3152a8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.66f, 4.01f)
                curveToRelative(-3.29f, -0.54f, -6.94f, 20.41f, -12.44f, 41.48f)
                curveToRelative(-2.25f, 8.63f, -20.36f, 71.4f, -20.36f, 71.4f)
                reflectiveCurveToRelative(36.41f, 18.07f, 64.27f, -3.41f)
                curveTo(88.87f, 93.99f, 76.11f, 37.74f, 68.58f, 12.9f)
                curveToRelative(-1.61f, -5.3f, -1.87f, -5.82f, -2.53f, -7.28f)
                curveToRelative(-0.46f, -1.02f, -0.92f, -1.53f, -1.39f, -1.61f)
                close()
                moveTo(59.22f, 48.03f)
                lineToRelative(3.02f, 5.88f)
                lineToRelative(-3.46f, 7.59f)
                lineToRelative(-2.8f, -7.89f)
                lineToRelative(3.24f, -5.59f)
                close()
                moveTo(77.32f, 70.34f)
                lineToRelative(3.03f, 5.89f)
                lineToRelative(-3.46f, 7.59f)
                lineToRelative(-2.8f, -7.89f)
                lineToRelative(3.24f, -5.59f)
                close()
                moveTo(50.89f, 91.48f)
                lineToRelative(3.03f, 5.88f)
                lineToRelative(-3.46f, 7.59f)
                lineToRelative(-2.8f, -7.89f)
                lineToRelative(3.24f, -5.59f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
