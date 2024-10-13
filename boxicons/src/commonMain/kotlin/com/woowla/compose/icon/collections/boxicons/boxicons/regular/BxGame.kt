package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxGame: ImageVector
    get() {
        if (_bxGame != null) {
            return _bxGame!!
        }
        _bxGame = Builder(name = "BxGame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.937f, 7.53f)
                curveTo(19.227f, 4.119f, 15.803f, 2.0f, 12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(3.803f, 0.0f, 7.227f, -2.119f, 8.937f, -5.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.397f, -1.316f)
                lineTo(15.017f, 12.0f)
                lineToRelative(5.522f, -3.153f)
                curveToRelative(0.461f, -0.264f, 0.636f, -0.842f, 0.398f, -1.317f)
                close()
                moveTo(12.504f, 11.132f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, 1.736f)
                lineToRelative(6.173f, 3.525f)
                arcTo(7.949f, 7.949f, 0.0f, false, true, 12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.0f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, 6.677f, 3.606f)
                lineToRelative(-6.173f, 3.526f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 7.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bxGame!!
    }

private var _bxGame: ImageVector? = null
