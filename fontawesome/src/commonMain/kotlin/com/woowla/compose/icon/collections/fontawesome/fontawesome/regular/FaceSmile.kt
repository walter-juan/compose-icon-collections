package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.FaceSmile: ImageVector
    get() {
        if (_faceSmile != null) {
            return _faceSmile!!
        }
        _faceSmile = Builder(name = "FaceSmile", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, -416.0f, 0.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(177.3f, 319.4f)
                curveTo(192.3f, 335.0f, 218.4f, 352.0f, 256.0f, 352.0f)
                reflectiveCurveToRelative(63.7f, -17.0f, 78.7f, -32.6f)
                curveToRelative(9.2f, -9.6f, 24.4f, -9.9f, 33.9f, -0.7f)
                reflectiveCurveToRelative(9.9f, 24.4f, 0.7f, 33.9f)
                curveToRelative(-22.1f, 23.0f, -60.0f, 47.4f, -113.3f, 47.4f)
                reflectiveCurveToRelative(-91.2f, -24.4f, -113.3f, -47.4f)
                curveToRelative(-9.2f, -9.6f, -8.9f, -24.8f, 0.7f, -33.9f)
                reflectiveCurveToRelative(24.8f, -8.9f, 33.9f, 0.7f)
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
        return _faceSmile!!
    }

private var _faceSmile: ImageVector? = null
