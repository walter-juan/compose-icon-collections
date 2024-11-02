package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Contrast: ImageVector
    get() {
        if (_contrast != null) {
            return _contrast!!
        }
        _contrast = Builder(name = "Contrast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(132.29f, 32.0f, 32.0f, 132.29f, 32.0f, 256.0f)
                reflectiveCurveTo(132.29f, 480.0f, 256.0f, 480.0f)
                reflectiveCurveTo(480.0f, 379.71f, 480.0f, 256.0f)
                reflectiveCurveTo(379.71f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(128.72f, 383.28f)
                arcTo(180.0f, 180.0f, 0.0f, false, true, 256.0f, 76.0f)
                verticalLineTo(436.0f)
                arcTo(178.82f, 178.82f, 0.0f, false, true, 128.72f, 383.28f)
                close()
            }
        }
        .build()
        return _contrast!!
    }

private var _contrast: ImageVector? = null
