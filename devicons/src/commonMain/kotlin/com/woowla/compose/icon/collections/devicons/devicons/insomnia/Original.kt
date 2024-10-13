package com.woowla.compose.icon.collections.devicons.devicons.insomnia

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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
import com.woowla.compose.icon.collections.devicons.devicons.InsomniaGroup

public val InsomniaGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 124.75f)
                curveToRelative(33.55f, 0.0f, 60.75f, -27.2f, 60.75f, -60.75f)
                curveToRelative(0.0f, -33.55f, -27.2f, -60.75f, -60.75f, -60.75f)
                curveTo(30.45f, 3.25f, 3.25f, 30.45f, 3.25f, 64.0f)
                curveToRelative(0.0f, 33.55f, 27.2f, 60.75f, 60.75f, 60.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4000bf)), stroke = null, strokeLineWidth = 0.0f,
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
                curveToRelative(0.0f, 31.75f, -25.74f, 57.49f, -57.49f, 57.49f)
                reflectiveCurveTo(6.51f, 95.75f, 6.51f, 64.0f)
                reflectiveCurveTo(32.25f, 6.51f, 64.0f, 6.51f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF7400E1), 1.0f to Color(0xFF4000BF), start =
                    Offset(64.72f,109.56f), end = Offset(64.72f,18.44f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.72f, 18.44f)
                curveToRelative(25.16f, 0.0f, 45.56f, 20.4f, 45.56f, 45.56f)
                curveToRelative(0.0f, 25.16f, -20.4f, 45.56f, -45.56f, 45.56f)
                curveToRelative(-25.16f, 0.0f, -45.56f, -20.4f, -45.56f, -45.56f)
                arcToRelative(45.41f, 45.41f, 0.0f, false, true, 3.43f, -17.37f)
                curveToRelative(3.22f, 4.39f, 8.43f, 7.24f, 14.29f, 7.24f)
                curveToRelative(9.79f, 0.0f, 17.72f, -7.93f, 17.72f, -17.72f)
                curveToRelative(0.0f, -5.87f, -2.85f, -11.07f, -7.24f, -14.29f)
                arcToRelative(45.43f, 45.43f, 0.0f, false, true, 17.37f, -3.43f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
