package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandBitbucket: ImageVector
    get() {
        if (_brandBitbucket != null) {
            return _brandBitbucket!!
        }
        _brandBitbucket = Builder(name = "BrandBitbucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.661f, 3.0f)
                lineToRelative(16.68f, 0.007f)
                curveToRelative(0.484f, -0.005f, 0.946f, 0.203f, 1.262f, 0.57f)
                curveToRelative(0.316f, 0.368f, 0.454f, 0.856f, 0.364f, 1.396f)
                lineToRelative(-3.338f, 14.651f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, true, -1.629f, 1.376f)
                horizontalLineToRelative(-10.01f)
                curveToRelative(-0.906f, -0.009f, -1.678f, -0.668f, -1.82f, -1.517f)
                lineToRelative(-3.148f, -14.576f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, true, 1.639f, -1.907f)
                moveToRelative(11.339f, 5.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.986f, 1.164f)
                lineToRelative(1.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.986f, 0.836f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.986f, -0.836f)
                lineToRelative(1.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.986f, -1.164f)
            }
        }
        .build()
        return _brandBitbucket!!
    }

private var _brandBitbucket: ImageVector? = null
