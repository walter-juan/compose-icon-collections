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

public val RegularGroup.BxBookOpen: ImageVector
    get() {
        if (_bxBookOpen != null) {
            return _bxBookOpen!!
        }
        _bxBookOpen = Builder(name = "BxBookOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, -2.0f, 0.78f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 10.0f, 3.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.758f)
                curveToRelative(0.526f, 0.0f, 1.042f, 0.214f, 1.414f, 0.586f)
                lineToRelative(1.121f, 1.121f)
                curveToRelative(0.009f, 0.009f, 0.021f, 0.012f, 0.03f, 0.021f)
                curveToRelative(0.086f, 0.079f, 0.182f, 0.149f, 0.294f, 0.196f)
                horizontalLineToRelative(0.002f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, 0.762f, 0.0f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.112f, -0.047f, 0.208f, -0.117f, 0.294f, -0.196f)
                curveToRelative(0.009f, -0.009f, 0.021f, -0.012f, 0.03f, -0.021f)
                lineToRelative(1.121f, -1.121f)
                arcTo(2.015f, 2.015f, 0.0f, false, true, 15.242f, 20.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(8.758f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(12.689f)
                arcTo(4.032f, 4.032f, 0.0f, false, false, 8.758f, 18.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-4.758f)
                curveToRelative(-0.799f, 0.0f, -1.584f, 0.246f, -2.242f, 0.689f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _bxBookOpen!!
    }

private var _bxBookOpen: ImageVector? = null
