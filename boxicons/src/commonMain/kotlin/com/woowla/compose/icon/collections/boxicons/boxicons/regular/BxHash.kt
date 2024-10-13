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

public val RegularGroup.BxHash: ImageVector
    get() {
        if (_bxHash != null) {
            return _bxHash!!
        }
        _bxHash = Builder(name = "BxHash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.018f, 3.815f)
                lineTo(15.232f, 8.0f)
                horizontalLineToRelative(-4.966f)
                lineToRelative(0.716f, -3.815f)
                lineToRelative(-1.964f, -0.37f)
                lineTo(8.232f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.857f)
                lineToRelative(-0.751f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.731f)
                lineToRelative(-0.714f, 3.805f)
                lineToRelative(1.965f, 0.369f)
                lineTo(8.766f, 16.0f)
                horizontalLineToRelative(4.966f)
                lineToRelative(-0.714f, 3.805f)
                lineToRelative(1.965f, 0.369f)
                lineToRelative(0.783f, -4.174f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.859f)
                lineToRelative(0.751f, -4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.733f)
                lineToRelative(0.716f, -3.815f)
                lineToRelative(-1.965f, -0.37f)
                close()
                moveTo(14.106f, 14.0f)
                horizontalLineTo(9.141f)
                lineToRelative(0.751f, -4.0f)
                horizontalLineToRelative(4.966f)
                lineToRelative(-0.752f, 4.0f)
                close()
            }
        }
        .build()
        return _bxHash!!
    }

private var _bxHash: ImageVector? = null
