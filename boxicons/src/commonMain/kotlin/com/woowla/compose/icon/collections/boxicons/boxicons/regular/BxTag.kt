package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxTag: ImageVector
    get() {
        if (_bxTag != null) {
            return _bxTag!!
        }
        _bxTag = Builder(name = "BxTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(8.515f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.627f, 0.838f)
                lineToRelative(-4.701f, 6.581f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.0f, 1.162f)
                lineToRelative(4.701f, 6.581f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.515f, 20.0f)
                lineTo(20.0f, 20.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(8.515f, 18.0f)
                lineToRelative(-4.286f, -6.0f)
                lineToRelative(4.286f, -6.0f)
                lineTo(20.0f, 6.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _bxTag!!
    }

private var _bxTag: ImageVector? = null
