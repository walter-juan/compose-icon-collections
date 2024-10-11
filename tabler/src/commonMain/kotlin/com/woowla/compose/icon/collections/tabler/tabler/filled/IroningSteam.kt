package com.woowla.compose.icon.collections.tabler.tabler.filled

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
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.IroningSteam: ImageVector
    get() {
        if (_ironingSteam != null) {
            return _ironingSteam!!
        }
        _ironingSteam = Builder(name = "IroningSteam", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.459f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.945f, 3.343f)
                lineToRelative(0.577f, 3.464f)
                lineToRelative(0.81f, 4.865f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.971f, 2.328f)
                horizontalLineToRelative(-16.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.652f)
                lineToRelative(-0.22f, -1.329f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.811f, -1.665f)
                lineToRelative(-0.162f, -0.006f)
                horizontalLineToRelative(-7.459f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.106f, 18.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.788f, 0.894f)
                lineToRelative(-1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.788f, -0.894f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.553f, 18.106f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.341f, 0.447f)
                lineToRelative(1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.788f, 0.894f)
                lineToRelative(-1.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.447f, -1.341f)
            }
        }
        .build()
        return _ironingSteam!!
    }

private var _ironingSteam: ImageVector? = null
