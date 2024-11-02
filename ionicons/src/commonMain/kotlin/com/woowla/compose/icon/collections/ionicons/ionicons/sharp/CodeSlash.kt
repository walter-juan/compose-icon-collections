package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

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
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.CodeSlash: ImageVector
    get() {
        if (_codeSlash != null) {
            return _codeSlash!!
        }
        _codeSlash = Builder(name = "CodeSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.98f, 397.63f)
                lineToRelative(-161.98f, -141.63f)
                lineToRelative(161.98f, -141.63f)
                lineToRelative(27.65f, 31.61f)
                lineToRelative(-125.63f, 110.02f)
                lineToRelative(125.63f, 110.02f)
                lineToRelative(-27.65f, 31.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(350.02f, 397.63f)
                lineToRelative(-27.65f, -31.61f)
                lineToRelative(125.63f, -110.02f)
                lineToRelative(-125.63f, -110.02f)
                lineToRelative(27.65f, -31.61f)
                lineToRelative(161.98f, 141.63f)
                lineToRelative(-161.98f, 141.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.15f, 442.0f)
                lineToRelative(-40.15f, -11.92f)
                lineToRelative(107.85f, -360.08f)
                lineToRelative(40.15f, 11.92f)
                lineToRelative(-107.85f, 360.08f)
                close()
            }
        }
        .build()
        return _codeSlash!!
    }

private var _codeSlash: ImageVector? = null
