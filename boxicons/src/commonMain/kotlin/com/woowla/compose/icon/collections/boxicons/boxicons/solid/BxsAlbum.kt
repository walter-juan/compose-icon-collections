package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsAlbum: ImageVector
    get() {
        if (_bxsAlbum != null) {
            return _bxsAlbum!!
        }
        _bxsAlbum = Builder(name = "BxsAlbum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.393f, 10.055f)
                arcTo(4.956f, 4.956f, 0.0f, false, false, 7.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, true, 2.051f, -4.95f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, true, 2.225f, -1.5f)
                lineToRelative(0.779f, 1.842f)
                curveToRelative(-0.596f, 0.252f, -1.13f, 0.612f, -1.59f, 1.072f)
                reflectiveCurveToRelative(-0.82f, 0.995f, -1.072f, 1.591f)
                close()
                moveTo(11.993f, 14.0f)
                arcToRelative(2.007f, 2.007f, 0.0f, true, true, 0.0f, -4.014f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, 0.0f, 4.014f)
                close()
            }
        }
        .build()
        return _bxsAlbum!!
    }

private var _bxsAlbum: ImageVector? = null
