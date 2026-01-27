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

public val SolidGroup.PlaceOfWorship: ImageVector
    get() {
        if (_placeOfWorship != null) {
            return _placeOfWorship!!
        }
        _placeOfWorship = Builder(name = "PlaceOfWorship", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 79.0f)
                lineToRelative(0.0f, 81.0f)
                lineToRelative(-44.8f, 33.6f)
                curveTo(103.1f, 202.7f, 96.0f, 216.9f, 96.0f, 232.0f)
                lineToRelative(0.0f, 40.0f)
                lineToRelative(-60.6f, 30.3f)
                curveTo(13.7f, 313.2f, 0.0f, 335.3f, 0.0f, 359.6f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                curveToRelative(74.7f, 0.0f, 85.4f, 0.0f, 320.0f, 0.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -88.4f)
                curveToRelative(0.0f, -24.2f, -13.7f, -46.4f, -35.4f, -57.2f)
                lineTo(416.0f, 272.0f)
                lineTo(416.0f, 232.0f)
                curveToRelative(0.0f, -15.1f, -7.1f, -29.3f, -19.2f, -38.4f)
                lineTo(352.0f, 160.0f)
                lineTo(352.0f, 79.0f)
                curveToRelative(0.0f, -9.5f, -4.2f, -18.5f, -11.5f, -24.6f)
                lineTo(271.4f, -3.2f)
                curveToRelative(-8.9f, -7.4f, -21.8f, -7.4f, -30.7f, 0.0f)
                lineTo(171.5f, 54.4f)
                curveTo(164.2f, 60.5f, 160.0f, 69.5f, 160.0f, 79.0f)
                close()
                moveTo(256.0f, 320.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _placeOfWorship!!
    }

private var _placeOfWorship: ImageVector? = null
