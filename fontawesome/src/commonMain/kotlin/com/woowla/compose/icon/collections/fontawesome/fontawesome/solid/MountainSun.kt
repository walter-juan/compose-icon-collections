package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.MountainSun: ImageVector
    get() {
        if (_mountainSun != null) {
            return _mountainSun!!
        }
        _mountainSun = Builder(name = "MountainSun", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.5f, 0.0f)
                curveToRelative(14.7f, 0.0f, 28.2f, 8.1f, 35.2f, 21.0f)
                lineToRelative(216.0f, 400.0f)
                curveToRelative(6.7f, 12.4f, 6.4f, 27.4f, -0.8f, 39.5f)
                curveToRelative(-7.2f, 12.1f, -20.3f, 19.5f, -34.3f, 19.5f)
                lineToRelative(-432.0f, 0.0f)
                curveToRelative(-14.1f, 0.0f, -27.1f, -7.4f, -34.3f, -19.5f)
                reflectiveCurveToRelative(-7.5f, -27.1f, -0.8f, -39.5f)
                lineToRelative(216.0f, -400.0f)
                lineToRelative(2.9f, -4.6f)
                curveTo(231.7f, 6.2f, 243.6f, 0.0f, 256.5f, 0.0f)
                close()
                moveTo(170.4f, 249.9f)
                lineToRelative(26.8f, 26.8f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                lineToRelative(43.3f, -43.3f)
                curveToRelative(6.0f, -6.0f, 14.1f, -9.4f, 22.6f, -9.4f)
                lineToRelative(42.8f, 0.0f)
                lineToRelative(-72.1f, -133.5f)
                lineToRelative(-86.1f, 159.4f)
                close()
                moveTo(496.5f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                close()
            }
        }
        .build()
        return _mountainSun!!
    }

private var _mountainSun: ImageVector? = null
