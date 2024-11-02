package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Codestream: ImageVector
    get() {
        if (_codestream != null) {
            return _codestream!!
        }
        _codestream = Builder(name = "Codestream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.541f, 18.246f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, true, 0.0f, -12.58f)
                lineTo(10.541f, 1.22f)
                arcTo(0.431f, 0.431f, 0.0f, false, false, 9.795f, 0.926f)
                lineToRelative(-9.36f, 9.971f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, false, 0.0f, 2.201f)
                lineToRelative(9.36f, 9.975f)
                arcToRelative(0.431f, 0.431f, 0.0f, false, false, 0.746f, -0.295f)
                close()
                moveTo(13.459f, 18.246f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, false, 0.0f, -12.58f)
                lineTo(13.459f, 1.22f)
                arcToRelative(0.431f, 0.431f, 0.0f, false, true, 0.746f, -0.294f)
                lineToRelative(9.36f, 9.971f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, true, 0.0f, 2.201f)
                lineToRelative(-9.36f, 9.975f)
                arcToRelative(0.431f, 0.431f, 0.0f, false, true, -0.746f, -0.295f)
                close()
                moveTo(15.723f, 11.956f)
                arcToRelative(3.728f, 3.731f, 0.0f, false, true, -3.728f, 3.731f)
                arcToRelative(3.728f, 3.731f, 0.0f, false, true, -3.728f, -3.731f)
                arcToRelative(3.728f, 3.731f, 0.0f, false, true, 3.728f, -3.731f)
                arcToRelative(3.728f, 3.731f, 0.0f, false, true, 3.728f, 3.731f)
                close()
            }
        }
        .build()
        return _codestream!!
    }

private var _codestream: ImageVector? = null
