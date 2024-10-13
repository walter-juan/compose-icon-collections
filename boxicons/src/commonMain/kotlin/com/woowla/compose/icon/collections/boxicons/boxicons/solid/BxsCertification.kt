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

public val SolidGroup.BxsCertification: ImageVector
    get() {
        if (_bxsCertification != null) {
            return _bxsCertification!!
        }
        _bxsCertification = Builder(name = "BxsCertification", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.047f, 14.667f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.466f, 0.607f)
                lineToRelative(1.909f, 1.104f)
                verticalLineToRelative(2.199f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.199f)
                lineToRelative(1.104f, 1.91f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, 1.366f, 0.366f)
                lineTo(12.0f, 20.75f)
                lineToRelative(1.91f, 1.104f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, 1.366f, -0.366f)
                lineToRelative(1.103f, -1.909f)
                horizontalLineToRelative(2.199f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(16.38f)
                lineToRelative(1.909f, -1.104f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.366f, -1.366f)
                lineTo(20.75f, 12.0f)
                lineToRelative(1.104f, -1.909f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.366f, -1.366f)
                lineToRelative(-1.909f, -1.104f)
                verticalLineTo(5.422f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(16.38f)
                lineToRelative(-1.103f, -1.909f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, -0.607f, -0.466f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.759f, 0.1f)
                lineTo(12.0f, 3.25f)
                lineToRelative(-1.909f, -1.104f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.366f, 0.365f)
                lineToRelative(-1.104f, 1.91f)
                horizontalLineTo(5.422f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineTo(7.62f)
                lineTo(2.513f, 8.725f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.365f, 1.366f)
                lineTo(3.251f, 12.0f)
                lineToRelative(-1.104f, 1.909f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, -0.1f, 0.758f)
                close()
            }
        }
        .build()
        return _bxsCertification!!
    }

private var _bxsCertification: ImageVector? = null
