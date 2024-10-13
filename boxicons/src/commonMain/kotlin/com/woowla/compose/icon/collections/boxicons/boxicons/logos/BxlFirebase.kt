package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlFirebase: ImageVector
    get() {
        if (_bxlFirebase != null) {
            return _bxlFirebase!!
        }
        _bxlFirebase = Builder(name = "BxlFirebase", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.239f, 15.063f)
                lineTo(7.21f, 2.381f)
                arcToRelative(0.453f, 0.453f, 0.0f, false, true, 0.847f, -0.145f)
                lineToRelative(2.12f, 3.979f)
                lineToRelative(-4.938f, 8.848f)
                close()
                moveTo(19.24f, 18.14f)
                lineTo(17.363f, 6.469f)
                arcToRelative(0.454f, 0.454f, 0.0f, false, false, -0.766f, -0.246f)
                lineTo(4.76f, 18.14f)
                lineToRelative(6.55f, 3.691f)
                curveToRelative(0.411f, 0.23f, 0.912f, 0.23f, 1.323f, 0.0f)
                lineToRelative(6.607f, -3.691f)
                close()
                moveTo(13.917f, 7.955f)
                lineTo(12.4f, 5.052f)
                arcToRelative(0.452f, 0.452f, 0.0f, false, false, -0.8f, 0.0f)
                lineTo(4.939f, 16.989f)
                lineToRelative(8.978f, -9.034f)
                close()
            }
        }
        .build()
        return _bxlFirebase!!
    }

private var _bxlFirebase: ImageVector? = null
