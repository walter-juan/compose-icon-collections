package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.HeadsetVr: ImageVector
    get() {
        if (_headsetVr != null) {
            return _headsetVr!!
        }
        _headsetVr = Builder(name = "HeadsetVr", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.248f)
                curveToRelative(1.857f, 0.0f, 3.526f, 0.641f, 4.65f, 1.794f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 2.518f, 1.09f)
                curveTo(13.907f, 1.482f, 11.295f, 0.0f, 8.0f, 0.0f)
                curveTo(4.75f, 0.0f, 2.12f, 1.48f, 0.844f, 4.122f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 2.289f, -1.047f)
                curveTo(4.236f, 1.872f, 5.974f, 1.248f, 8.0f, 1.248f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.786f, -1.13f)
                lineToRelative(-0.002f, -0.002f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.276f, -0.167f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 8.0f, 10.5f)
                curveToRelative(-0.414f, 0.0f, -0.729f, 0.103f, -0.935f, 0.201f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.277f, 0.167f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
            }
        }
        .build()
        return _headsetVr!!
    }

private var _headsetVr: ImageVector? = null
