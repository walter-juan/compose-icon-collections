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

public val SolidGroup.FaceFrown: ImageVector
    get() {
        if (_faceFrown != null) {
            return _faceFrown!!
        }
        _faceFrown = Builder(name = "FaceFrown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(346.6f, 398.1f)
                curveToRelative(-20.4f, -28.0f, -53.4f, -46.1f, -90.6f, -46.1f)
                reflectiveCurveToRelative(-70.2f, 18.1f, -90.6f, 46.1f)
                curveToRelative(-7.8f, 10.7f, -22.8f, 13.1f, -33.5f, 5.3f)
                reflectiveCurveToRelative(-13.1f, -22.8f, -5.3f, -33.5f)
                curveTo(155.7f, 330.0f, 202.8f, 304.0f, 256.0f, 304.0f)
                reflectiveCurveToRelative(100.3f, 26.0f, 129.4f, 65.9f)
                curveToRelative(7.8f, 10.7f, 5.4f, 25.7f, -5.3f, 33.5f)
                reflectiveCurveToRelative(-25.7f, 5.4f, -33.5f, -5.3f)
                close()
                moveTo(144.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(336.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceFrown!!
    }

private var _faceFrown: ImageVector? = null
