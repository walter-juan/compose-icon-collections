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

public val SolidGroup.Store: ImageVector
    get() {
        if (_store != null) {
            return _store!!
        }
        _store = Builder(name = "Store", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.7f, 72.3f)
                curveTo(37.6f, 48.4f, 59.5f, 32.0f, 84.4f, 32.0f)
                lineToRelative(344.0f, 0.0f)
                curveToRelative(24.9f, 0.0f, 46.8f, 16.4f, 53.8f, 40.3f)
                lineToRelative(23.4f, 80.2f)
                curveToRelative(12.8f, 43.7f, -20.1f, 87.5f, -65.6f, 87.5f)
                curveToRelative(-26.3f, 0.0f, -49.4f, -14.9f, -60.8f, -37.1f)
                curveToRelative(-11.6f, 21.9f, -34.6f, 37.1f, -61.4f, 37.1f)
                curveToRelative(-26.6f, 0.0f, -49.7f, -15.0f, -61.3f, -37.0f)
                curveToRelative(-11.6f, 22.0f, -34.7f, 37.0f, -61.3f, 37.0f)
                curveToRelative(-26.8f, 0.0f, -49.8f, -15.1f, -61.4f, -37.1f)
                curveToRelative(-11.4f, 22.1f, -34.5f, 37.1f, -60.8f, 37.1f)
                curveToRelative(-45.6f, 0.0f, -78.4f, -43.7f, -65.6f, -87.5f)
                lineTo(30.7f, 72.3f)
                close()
                moveTo(96.4f, 352.0f)
                lineToRelative(320.0f, 0.0f)
                lineToRelative(0.0f, -66.4f)
                curveToRelative(7.6f, 1.6f, 15.5f, 2.4f, 23.5f, 2.4f)
                curveToRelative(14.3f, 0.0f, 28.0f, -2.6f, 40.5f, -7.2f)
                lineToRelative(0.0f, 151.2f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-352.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -151.2f)
                curveToRelative(12.5f, 4.6f, 26.1f, 7.2f, 40.5f, 7.2f)
                curveToRelative(8.1f, 0.0f, 15.9f, -0.8f, 23.5f, -2.4f)
                lineToRelative(0.0f, 66.4f)
                close()
            }
        }
        .build()
        return _store!!
    }

private var _store: ImageVector? = null
