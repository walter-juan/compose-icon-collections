package com.woowla.compose.icon.collections.devicons.devicons.insomnia

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.InsomniaGroup

public val InsomniaGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.65f, 0.0f, 0.0f, 28.65f, 0.0f, 64.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(64.0f, 6.51f)
                curveToRelative(31.75f, 0.0f, 57.49f, 25.74f, 57.49f, 57.49f)
                reflectiveCurveTo(95.75f, 121.49f, 64.0f, 121.49f)
                reflectiveCurveTo(6.51f, 95.75f, 6.51f, 64.0f)
                reflectiveCurveTo(32.25f, 6.51f, 64.0f, 6.51f)
                close()
                moveTo(64.72f, 18.44f)
                arcToRelative(45.42f, 45.42f, 0.0f, false, false, -17.37f, 3.43f)
                curveToRelative(4.39f, 3.22f, 7.24f, 8.43f, 7.24f, 14.29f)
                curveToRelative(0.0f, 9.78f, -7.93f, 17.72f, -17.72f, 17.72f)
                curveToRelative(-5.86f, 0.0f, -11.07f, -2.85f, -14.29f, -7.24f)
                arcTo(45.42f, 45.42f, 0.0f, false, false, 19.16f, 64.0f)
                curveToRelative(0.0f, 25.16f, 20.4f, 45.56f, 45.56f, 45.56f)
                reflectiveCurveToRelative(45.56f, -20.4f, 45.56f, -45.56f)
                curveToRelative(0.0f, -25.16f, -20.4f, -45.56f, -45.56f, -45.56f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
