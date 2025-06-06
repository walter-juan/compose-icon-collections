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

public val SharpGroup.FilterCircle: ImageVector
    get() {
        if (_filterCircle != null) {
            return _filterCircle!!
        }
        _filterCircle = Builder(name = "FilterCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(304.0f, 352.0f)
                lineTo(208.0f, 352.0f)
                lineTo(208.0f, 320.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(352.0f, 288.0f)
                lineTo(160.0f, 288.0f)
                lineTo(160.0f, 256.0f)
                lineTo(352.0f, 256.0f)
                close()
                moveTo(384.0f, 224.0f)
                lineTo(128.0f, 224.0f)
                lineTo(128.0f, 192.0f)
                lineTo(384.0f, 192.0f)
                close()
            }
        }
        .build()
        return _filterCircle!!
    }

private var _filterCircle: ImageVector? = null
